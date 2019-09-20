package com.example.demo.mh_api;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Api("MH07: 服装分类")
@RequestMapping("/MH07")
public class MhClassificationController {
}
