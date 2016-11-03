package com.ksc.cdn;

import com.ksc.cdn.model.content.CreatePreloadRequest;
import com.ksc.cdn.model.content.CreatePreloadResult;

public interface KscCdn {
	
	public CreatePreloadResult createPreload(CreatePreloadRequest createPreloadRequest);
	

}
