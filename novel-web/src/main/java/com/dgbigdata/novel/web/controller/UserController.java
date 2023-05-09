package com.dgbigdata.novel.web.controller;

import com.dgbigdata.common.api.domain.ResultBean;
import com.dgbigdata.novel.web.constant.ApiRouterConsts;
import com.dgbigdata.novel.web.domain.param.UserCreateParam;
import com.dgbigdata.novel.web.domain.vo.UserRegisterVo;
import com.dgbigdata.novel.web.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "前台门户会员相关接口")
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_USER_URL_PREFIX)
@RequiredArgsConstructor
public class UserController {

    private final UserInfoService userInfoService;

    /**
     * 用户注册接口
     */
    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public ResultBean<UserRegisterVo> register(@Validated @RequestBody UserCreateParam param) {
        UserRegisterVo vo = userInfoService.register(param.getUserCreateDto());
        return ResultBean.ok(vo);
    }


}
