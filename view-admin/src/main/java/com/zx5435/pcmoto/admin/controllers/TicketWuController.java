package com.zx5435.pcmoto.admin.controllers;

import com.zx5435.pcmoto.admin.model.base.TicketWuDO;
import com.zx5435.pcmoto.admin.model.scope.TicketWuModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("ticket-wu")
public class TicketWuController {

    @Resource
    TicketWuModel ticketWuModel;

    @RequestMapping(value = "index")
    public String index(Model m) {
        List<TicketWuDO> res = ticketWuModel.all();

        m.addAttribute("arr", res);

        return "ticket-wu/index";
    }

}
