package com.ideapro.blank.controller;

import com.ideapro.blank.common.Exception.BizException;
import com.ideapro.blank.common.result.Result;
import com.ideapro.blank.common.result.ResultUtils;
import com.ideapro.blank.model.vo.UserVo;
import com.ideapro.blank.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/user/v1")
@RestController
@Api(value = "用戶接口")
public class UserController {

    @Autowired
    private IUserService userService;

    //@ResponseBody
    @RequestMapping(value = "/queryUser", method = RequestMethod.GET)
    @ApiOperation(value = "查询用戶信息", notes = "查询用戶信息")
    // @ModelAttribute注解可以将Json格式转为form表单格式
    private Result addUser(@ModelAttribute @RequestParam Map<String, Object> param) {
        if (null == param) {
            return ResultUtils.error(400, "查询信息为空！");
        }
        List<UserVo> list;
        try {
            list = userService.query(param);
        }catch (BizException e){
            return ResultUtils.error(400, e.getMessage());
        }
        return ResultUtils.success(list);
    }
}
