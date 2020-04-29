package com.muchi.controller;



import com.muchi.domain.CommonResult;
import com.muchi.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        log.info("扣减库存开始");
        storageService.decrease(productId, count);
        log.info("扣减库存成功");
        return new CommonResult(200,"扣减库存成功！");
    }


    @RequestMapping("/storage/test")
    public CommonResult test() {

        log.info("扣减库存成功");
        return new CommonResult(200,"扣减库存成功！");
    }

}
