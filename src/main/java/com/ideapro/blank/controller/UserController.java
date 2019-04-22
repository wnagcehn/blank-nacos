package com.ideapro.blank.controller;

import com.ideapro.blank.common.result.Result;
import com.ideapro.blank.common.result.ResultUtils;
import com.ideapro.blank.model.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/user/v1")
@RestController
@Api(value = "用戶接口")
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ApiOperation(value = "添加用戶信息", notes = "添加用戶信息")
    // @ModelAttribute注解可以将Json格式转为form表单格式
    private Result addUser(@Valid @ModelAttribute @RequestBody UserVo userVo) {
        if (null == userVo) {
            return ResultUtils.error(400, "用户为空！");
        }
        return ResultUtils.success("添加成功！");
    }
}
