package com.ksc.live;


import com.ksc.live.model.GetListRequest;
import com.ksc.live.model.LiveResult;

public interface Live {


    public LiveResult listPubStreamsInfo(GetListRequest liveRequest);
}
