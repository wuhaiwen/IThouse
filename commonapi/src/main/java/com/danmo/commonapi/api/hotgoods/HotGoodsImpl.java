package com.danmo.commonapi.api.hotgoods;

import android.content.Context;
import android.support.annotation.NonNull;

import com.danmo.commonapi.base.BaseImpl;
import com.danmo.commonapi.callback.BaseCallback;
import com.danmo.commonapi.event.GetHotGoodsBannerEvent;
import com.danmo.commonapi.event.GetHotGoodsListEvent;
import com.danmo.commonapi.event.GetHotGoodsRankEvent;
import com.danmo.commonutil.UUIDGenerator;

public class HotGoodsImpl extends BaseImpl<HotGoodsService> implements HotGoodsApi {
    public HotGoodsImpl(@NonNull Context context, int currentParse) {
        super(context, currentParse);
    }

    @Override
    public String getHotGoodsBannerList(String url) {
        String uuid = UUIDGenerator.getUUID();
        mService.getHotGoodsBannerList(url).enqueue(new BaseCallback<>(new GetHotGoodsBannerEvent(uuid)));
        return uuid;
    }

    @Override
    public String getHotGoodsRankList(String url) {
        String uuid = UUIDGenerator.getUUID();
        mService.getHotGoodsRankList(url).enqueue(new BaseCallback<>(new GetHotGoodsRankEvent(uuid)));
        return uuid;
    }

    @Override
    public String getHotGoodsList(String url) {
        String uuid = UUIDGenerator.getUUID();
        mService.getHotGoodsList(url).enqueue(new BaseCallback<>(new GetHotGoodsListEvent(uuid)));
        return uuid;
    }
}
