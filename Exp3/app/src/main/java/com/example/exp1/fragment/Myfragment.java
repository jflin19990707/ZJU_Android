package com.example.exp1.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exp1.Exp2.ItemAdapter;
import com.example.exp1.Exp2.ItemList;
import com.example.exp1.R;

import java.util.ArrayList;
import java.util.List;

public class Myfragment extends Fragment{
    private RecyclerView mRecyclerView;
    private List<ItemList> itemList = new ArrayList<>();

    private static final String TAG = "HelloFragment";

    @SuppressLint("WrongConstant")
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myfragment,container,false);
        mRecyclerView = view.findViewById(R.id.mf);
        ItemAdapter mAdapter = new ItemAdapter();
        InitItem();
        Activity activity = getActivity();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false));
        mRecyclerView.setItemAnimator (new DefaultItemAnimator());
        mRecyclerView.setAdapter (mAdapter);
        mRecyclerView.addItemDecoration (new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        mAdapter.setList(itemList);
        mAdapter.notifyDataSetChanged();
        return view;
    }
    private void InitItem() {
        ItemList itm1 = new ItemList(1,"蔡徐鲲再度告c站",666666);
        itemList.add(itm1);
        ItemList itm2 = new ItemList(2,"精灵宝可梦剑盾图鉴断代",655543);
        itemList.add(itm2);
        ItemList itm3 = new ItemList(3,"日本开始卖鲸鱼肉",352345);
        itemList.add(itm3);
        ItemList itm4 = new ItemList(4,"硬核大妈地铁杀鸡",333334);
        itemList.add(itm4);
        ItemList itm5 = new ItemList(5,"苹果商店暗藏骗局",322222);
        itemList.add(itm5);
        ItemList itm6 = new ItemList(6,"乐山大佛像擦粉底",315345);
        itemList.add(itm6);
        ItemList itm7 = new ItemList(7,"垃圾分类的梗传疯",312035);
        itemList.add(itm7);
        ItemList itm8 = new ItemList(8,"大闸蟹再成通缉犯",311111);
        itemList.add(itm8);
        ItemList itm9 = new ItemList(9,"郭艾伦晃倒对手",310234);
        itemList.add(itm9);
        ItemList itm10 = new ItemList(10,"兵长砍猴",309999);
        itemList.add(itm10);
        ItemList itm11 = new ItemList(11,"看恐怖片可以减肥",308865);
        itemList.add(itm11);
        ItemList itm12 = new ItemList(12,"大学前后有何不同",257767);
        itemList.add(itm12);
        ItemList itm13 = new ItemList(13,"明日方舟第五章活动开启",256666);
        itemList.add(itm13);
        ItemList itm14 = new ItemList(14,"看蜡笔小新会变笨",247767);
        itemList.add(itm14);
        ItemList itm15 = new ItemList(15,"大学前后有何不同",225767);
        itemList.add(itm15);
        ItemList itm16 = new ItemList(16,"明日方舟再次登顶Appstore",205555);
        itemList.add(itm16);
        ItemList itm17 = new ItemList(17,"为什么你二十岁了还没有女朋友",193456);
        itemList.add(itm17);
        ItemList itm18 = new ItemList(18,"第一次见过这么长的自拍杆",187767);
        itemList.add(itm18);
        ItemList itm19 = new ItemList(19,"为什么你氪了一单还是没抽到陈？抽卡玄学",177777);
        itemList.add(itm19);
        ItemList itm20 = new ItemList(20,"王者荣耀新英雄耀",157587);
        itemList.add(itm20);
    }
}
