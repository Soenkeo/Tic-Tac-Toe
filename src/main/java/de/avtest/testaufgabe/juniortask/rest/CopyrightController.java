package de.avtest.testaufgabe.juniortask.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/copyright")
public class CopyrightController {

  String gameName = " _____ _        _____             _____           \n" +
    "/__   (_) ___  /__   \\__ _  ___  /__   \\___   ___ \n" +
    "  / /\\/ |/ __|   / /\\/ _` |/ __|   / /\\/ _ \\ / _ \\\n" +
    " / /  | | (__   / / | (_| | (__   / / | (_) |  __/\n" +
    " \\/   |_|\\___|  \\/   \\__,_|\\___|  \\/   \\___/ \\___|\n" +
    "                                                  \n";
  String avTest = "__________           _________                     __           \n" +
          "\\______   \\___.__.  /   _____/ ____   ____   ____ |  | __ ____  \n" +
          " |    |  _<   |  |  \\_____  \\ /  _ \\_/ __ \\ /    \\|  |/ // __ \\\n" +
          " |    |   \\\\___  |  /        (  <_> )  ___/|   |  \\    <\\  ___/\n" +
          " |______  // ____| /_______  /\\____/ \\___  >___|  /__|_ \\\\___  >\n" +
          "        \\/ \\/              \\/            \\/     \\/     \\/    \\/\n";


  @GetMapping(produces = "text/plain")
  public String getCopyright() {
    return gameName + avTest;
  }

}
