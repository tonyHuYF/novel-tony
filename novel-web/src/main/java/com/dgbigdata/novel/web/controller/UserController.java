package com.dgbigdata.novel.web.controller;

import cn.hutool.core.bean.BeanUtil;
import com.dgbigdata.common.api.domain.ResultBean;
import com.dgbigdata.novel.web.auth.UserHolder;
import com.dgbigdata.novel.web.constant.ApiRouterConsts;
import com.dgbigdata.novel.web.domain.dto.req.UserInfoDto;
import com.dgbigdata.novel.web.domain.dto.resp.UserInfoRespDto;
import com.dgbigdata.novel.web.domain.dto.resp.UserLoginRespDto;
import com.dgbigdata.novel.web.domain.dto.resp.UserRegisterDto;
import com.dgbigdata.novel.web.domain.param.*;
import com.dgbigdata.novel.web.domain.vo.UserInfoVo;
import com.dgbigdata.novel.web.domain.vo.UserLoginVo;
import com.dgbigdata.novel.web.domain.vo.UserRegisterVo;
import com.dgbigdata.novel.web.service.BookService;
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

    private final BookService bookService;

    /**
     * 用户注册接口
     */
    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public ResultBean<UserRegisterVo> register(@Validated @RequestBody UserCreateParam param) {
        UserRegisterDto dto = userInfoService.register(param.getUserCreateDto());
        return ResultBean.ok(new UserRegisterVo(dto.getUserId(), dto.getToken()));
    }

    /**
     * 用户登录接口
     */
    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public ResultBean<UserLoginVo> login(@Validated @RequestBody UserLoginParam param) {
        UserLoginRespDto dto = userInfoService.login(param.getUserLoginDto());
        return ResultBean.ok(BeanUtil.copyProperties(dto, UserLoginVo.class));
    }


    @ApiOperation("查询单个用户信息")
    @PostMapping("/one")
    public ResultBean<UserInfoVo> queryOne() {
        UserInfoRespDto dto = userInfoService.queryOne(new UserInfoDto(UserHolder.getUserId()));
        return ResultBean.ok(BeanUtil.copyProperties(dto, UserInfoVo.class));
    }

    @ApiOperation("用户信息修改")
    @PostMapping("/update")
    public ResultBean<Void> update(@Validated @RequestBody UserUpdateParam param) {
        param.setId(UserHolder.getUserId());
        userInfoService.update(param.getUserUpdateDto());
        return ResultBean.ok();
    }

    @ApiOperation("用户反馈提交接口")
    @PostMapping("/feedback")
    public ResultBean<Void> submitFeedback(@Validated @RequestBody UserFeedbackCreateParam param) {
        param.setUserId(UserHolder.getUserId());
        userInfoService.submitFeedback(param.getUserFeedbackCreateDto());
        return ResultBean.ok();
    }

    @ApiOperation("用户反馈删除接口")
    @PostMapping("/feedback/delete")
    public ResultBean<Void> deleteFeedback(@Validated @RequestBody UserFeedbackDeleteParam param) {
        param.setUserId(UserHolder.getUserId());
        userInfoService.deleteFeedback(param.getUserFeedbackDeleteDto());
        return ResultBean.ok();
    }

    @ApiOperation("评论发表接口")
    @PostMapping("/comment/create")
    public ResultBean<Void> createComment(@Validated @RequestBody CommentCreateParam param) {
        param.setUserId(UserHolder.getUserId());
        bookService.createComment(param.getCommentCreateDto());
        return ResultBean.ok();
    }

    @ApiOperation("评论修改接口")
    @PostMapping("/comment/update")
    public ResultBean<Void> updateComment(@Validated @RequestBody CommentUpdateParam param) {
        param.setUserId(UserHolder.getUserId());
        bookService.updateComment(param.getCommentUpdateDto());
        return ResultBean.ok();
    }


    @ApiOperation("评论删除接口")
    @PostMapping("/comment/delete")
    public ResultBean<Void> deleteComment(@Validated @RequestBody CommentDeleteParam param) {
        param.setUserId(UserHolder.getUserId());
        bookService.deleteComment(param.getCommentDeleteDto());
        return ResultBean.ok();
    }


}
