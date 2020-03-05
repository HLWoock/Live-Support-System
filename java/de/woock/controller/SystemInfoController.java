package de.woock.controller;

import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.woock.entity.SystemInfo;
import de.woock.service.SystemInfoService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/system")
public class SystemInfoController {
	
	SystemInfoService systemInfoService;
	
	@GetMapping("/info")
    public SystemInfo info() throws UnknownHostException {
       return systemInfoService.getSystemInfo();
	}
}
