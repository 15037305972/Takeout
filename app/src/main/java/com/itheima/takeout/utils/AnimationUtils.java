package com.itheima.takeout.utils;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;

/**
 * ============================================================
 * Copyright：JackChan和他的朋友们有限公司版权所有 (c) 2017
 * Author：   JackChan
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChan1999
 * GitBook：  https://www.gitbook.com/@alleniverson
 * CSDN博客： http://blog.csdn.net/axi295309066
 * 个人博客： https://jackchan1999.github.io/
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：Takeout
 * Package_Name：com.itheima.takeout
 * Version：1.0
 * time：2017/5/30 13:52
 * des ：动画工具类
 * gitVersion：2.12.0.windows.1
 * updateAuthor：AllenIverson
 * updateDate：2017/5/30 13:52
 * updateDes：${TODO}
 * ============================================================
 */

public class AnimationUtils {

    /**
     * 显示动画
     * @return
     */
    public static AnimationSet getShowMinusAnimation() {
        AnimationSet set = new AnimationSet(false);
        TranslateAnimation translate = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 10, Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 0);
        RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        AlphaAnimation alpha = new AlphaAnimation(0, 1);
        set.addAnimation(translate);
        set.addAnimation(rotate);
        set.addAnimation(alpha);
        set.setDuration(200);
        return set;
    }

    /**
     * 隐藏动画
     * @return
     */
    public static AnimationSet getHideMinusAnimation() {
        AnimationSet set = new AnimationSet(false);
        TranslateAnimation translate = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 20, Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 0);
        RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        AlphaAnimation alpha = new AlphaAnimation(1, 0);
        set.addAnimation(translate);
        set.addAnimation(rotate);
        set.addAnimation(alpha);
        set.setDuration(200);
        return set;
    }

    /**
     * 创建添加图片进入购物车的动画
     */

    public static Animation getAddAnimation(int[] destLocation, int[] srcLocation) {
        AnimationSet set = new AnimationSet(false);
        TranslateAnimation translateX = new TranslateAnimation(Animation.ABSOLUTE, 0, Animation.ABSOLUTE, destLocation[0] - srcLocation[0],
                Animation.ABSOLUTE, 0, Animation.ABSOLUTE, 0);
        translateX.setInterpolator(new LinearInterpolator());

        TranslateAnimation translateY = new TranslateAnimation(Animation.ABSOLUTE, 0, Animation.ABSOLUTE, 0,
                Animation.ABSOLUTE, 0, Animation.ABSOLUTE, destLocation[1] - srcLocation[1]);
        translateY.setInterpolator(new AccelerateInterpolator());
        AlphaAnimation alpha = new AlphaAnimation(1, 0.5f);
        //添加动画到集合
        set.addAnimation(translateX);
        set.addAnimation(translateY);
        set.addAnimation(alpha);
        set.setDuration(200);
        return set;
    }

    public static class AnimationListenerAdapter implements Animation.AnimationListener{
        @Override
        public void onAnimationStart(Animation animation) {
        }

        @Override
        public void onAnimationEnd(Animation animation) {
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }
    }
}
