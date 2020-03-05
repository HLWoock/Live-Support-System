package de.woock.service;

import java.lang.Runtime.Version;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import de.woock.entity.SystemInfo;

@Service
public class SystemInfoService {
	
	@Value("${spring.application.name}")
	String system;

	public SystemInfo getSystemInfo() throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getLocalHost();
		Runtime     runtime     = Runtime.getRuntime();
		Version     vers        = Runtime.version();
		
		String version = String.format("%d.%d.%d", vers.feature(), vers.interim(), vers.patch());
        
        SystemInfo systemInfo = SystemInfo.builder()
        		                          .system(system)
        		                          .ip(inetAddress.getHostAddress())
                                          .host(inetAddress.getHostName())
                                          .hostName(inetAddress.getCanonicalHostName())
                                          .Processors(runtime.availableProcessors())
                                          .freeMem(runtime.freeMemory())
                                          .maxMem(runtime.maxMemory())
                                          .totalMem(runtime.totalMemory())
                                          .version(version)
                                          .build();
        return systemInfo;
	}
}
