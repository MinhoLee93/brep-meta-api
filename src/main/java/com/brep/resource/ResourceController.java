package com.brep.resource;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("resource/v1")
public class ResourceController {

    @GetMapping("/member/{memberId}")
    public String getMember(@PathVariable Long memberId) {
        return "Member : " + memberId;
    }
}
