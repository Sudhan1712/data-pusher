package com.subash.data.pusher.controller;

import com.subash.data.pusher.view.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping("/version")
    public String getVersion() {
        return "Subash";
    }

    @PostMapping("/server/incoming_data")
    public String acceptIncomingData(@RequestBody Account account) {
        System.out.println(account.toString());
        return "Accepted";
    }
}
