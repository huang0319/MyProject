package com.ruimin.oadsp.web;
import com.ruimin.oadsp.core.Result;
import com.ruimin.oadsp.core.ResultGenerator;
import com.ruimin.oadsp.model.Userinfo;
import com.ruimin.oadsp.service.UserinfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/08/20.
*/
@RestController
@RequestMapping("/userinfo")
public class UserinfoController {
    @Resource
    private UserinfoService userinfoService;

    @PostMapping("/add")
    public Result add(Userinfo userinfo) {
        userinfoService.save(userinfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userinfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Userinfo userinfo) {
        userinfoService.update(userinfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Userinfo userinfo = userinfoService.findById(id);
        return ResultGenerator.genSuccessResult(userinfo);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Userinfo> list = userinfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
