package com.brep.meta;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 설명 :
 *
 * @author 이민호(Mark) / minholee93@sk.com
 * 2021/01/27
 * 1:41 오전
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("meta/v1")
public class MetaController {

    @GetMapping("/tracks")
    public String getTracks() {
        return "Track1";
    }
}
