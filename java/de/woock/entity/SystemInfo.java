package de.woock.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SystemInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String system;
	String hostName;
	String host;
	String ip;
	
	int Processors;
	long freeMem;
	long maxMem;
	long totalMem;
	
	String version;
	
	
}
