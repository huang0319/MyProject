package com.ruimin.oadsp.web;
import com.ruimin.oadsp.core.Result;
import com.ruimin.oadsp.core.ResultGenerator;
import com.ruimin.oadsp.model.UsrBsInf;
import com.ruimin.oadsp.service.UsrBsInfService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王玉栋 
 * @data 2017-11-16 13:54:23
 */
@RestController
@RequestMapping("/usr/bs/inf")
public class UsrBsInfController {

    @Resource
    private UsrBsInfService usrBsInfService;

    @PostMapping("/add")
    public Result add(UsrBsInf usrBsInf) {
        usrBsInfService.save(usrBsInf);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        usrBsInfService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UsrBsInf usrBsInf) {
        usrBsInfService.update(usrBsInf);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        UsrBsInf usrBsInf = usrBsInfService.findById(id);
        return ResultGenerator.genSuccessResult(usrBsInf);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UsrBsInf> list = usrBsInfService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

}
