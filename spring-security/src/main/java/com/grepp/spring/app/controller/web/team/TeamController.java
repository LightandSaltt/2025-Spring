package com.grepp.spring.app.controller.web.team;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("team")
public class TeamController {

    @GetMapping("{id}")
    @PreAuthorize("hasAnyAuthority('TEAM' + #id + ':MEMBER' + 'TEAM_' + #id + ':LEADER')")
    public String teamPage(
        @PathVariable int id
    ) {
        return "team/team";
    }

    @GetMapping("{id}/dashboard")
    @PreAuthorize("hasAuthority('TEAM' + #id + ':LEADER')")
    public String teamDashBoard(
        @PathVariable int id
    ) {
        return "team/dashboard";
    }
}
