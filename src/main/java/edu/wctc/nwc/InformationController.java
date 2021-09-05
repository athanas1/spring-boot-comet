package edu.wctc.nwc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/information")
public class InformationController {

    @RequestMapping("/neowisecometfacts")
        public String showCometFacts1 () { return "pages/neowise-facts"; }

    @RequestMapping("/cometfacts")
    public String showCometFacts2 () {
        return "pages/comet-facts";
    }

    @RequestMapping("/howtoview")
    public String showHowToView() {
        return "pages/how-to-view";
    }
}
