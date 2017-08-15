package com.gftools

import android.graphics.Bitmap
import com.gftools.utils.*

/**
 * Created by FH on 2017/8/10.
 */

class BitmapCompare54e(bitmap : Bitmap) : BaseBitmapCompare(bitmap) {
    override fun isCorrectZHANYIChoosed() : Boolean{
        if (isPiexlEqual(344 , 479 , 255 , 178 , 0)
                && isPiexlEqual(515 , 392 , 255 , 178 , 0)
                && isPiexlEqual(890 , 239 , 255 , 255 , 255)
                && isPiexlEqual(1063 , 245 , 255 , 255 , 255)
                && isPiexlEqual(1013 , 606 , 255 , 255 , 255)
                && isPiexlEqual(1100 , 617 , 140 , 138 , 140)
                && isPiexlEqual(1199 , 625 , 255 , 255 , 255)
                ){
            lv("已经切换到了正确的战役")
            return true
        }
        else {
            lv("还未还未还未还未切换到正确的战役")
            return false
        }
    }

    override fun isViewAtLocation1() : Boolean{
        if (isPiexlEqual(844 , 520 , 255 , 255 , 255)
                && isPiexlEqual(1050 , 334 , 255 , 255 , 255)
                && isPiexlEqual(1276, 287 , 255 , 255 , 255)
                ){
            lv("视角在位置1")
            return true
        }
        else {
            lv("视角不在不在不在位置1")
            return false
        }
    }


    fun isViewAtLocation2() : Boolean{
        if (isPiexlEqual(1389 , 825, 255 , 255 , 255)
                && isPiexlEqual(1408 , 893 , 255 , 255 , 255)
                && isPiexlEqual(793 , 473 , 255 , 255 , 255)
                && isPiexlEqual(1368 , 754 , 255 , 255 , 255)
                && isPiexlEqual(872 , 486 , 255 , 255 , 255)
                ){
            lv("视角在位置2")
            return true
        }
        lv("视角不在不在不在位置2")
        return false
    }

    fun isCharactorAtHome() : Boolean{
        return isPiexlEqual(1364 , 483 , 255 , 255 , 255)
                && isPiexlEqual(1453, 490 , 255 , 255 , 255)
                && isPiexlEqual(1507, 499 , 255 , 255 , 255)
    }

    override fun isCharactorAtLocation1() : Int{
        if (isPiexlEqual(1464 , 434 , 255 , 255 , 255)
                && isPiexlEqual(1552 , 436 , 255 , 255 , 255)
                && isPiexlEqual(1605 , 447 , 255 , 255 , 255)
                ){
            if (isPiexlEqual(1314 , 365 , 255 , 186 , 0)
                    && isPiexlEqual(1432 , 491 , 255 , 186 , 0)
                    && isPiexlEqual(1191 , 492 , 255 , 186 , 0)
                    && isPiexlEqual(1313 , 599 , 255 , 186 , 0)
                    ){
                lv("角色在位置1,并且已选中")
                return 2
            }
            else{
                lv("角色在位置1,但是未选中")
                return 1
            }
        }
        else {
            lv("角色不在不在不在不在位置1")
            return 0
        }
    }

    fun isCharactorAtLocation2() : Int{
        if (isPiexlEqual(702 , 323 , 255 , 255 , 255)
                && isPiexlEqual(787 , 322 , 255 , 255 , 255)
                && isPiexlEqual(813 , 304 , 255 , 255 , 255)
                ){
            if (isPiexlEqual(614 , 255 , 255 , 186 , 0)
                    && isPiexlEqual(502 , 375 , 255 , 186 , 0)
                    && isPiexlEqual(735 , 375 , 255 , 186 , 0)
                    && isPiexlEqual(613 , 488 , 255 , 186 , 0)
                    ){
                lv("角色在位置2,并且已选中")
                return 2
            }
            else{
                lv("角色在位置2,但是未选中")
                return 1
            }
        }
        else {
            lv("角色不在不在不在不在位置2")
            return 0
        }
    }

    fun isCharactorAtLocation3() : Int{
        if (isPiexlEqual(117 , 392 , 255 , 255 , 255)
                && isPiexlEqual(187 , 403 , 255 , 255 , 255)
                && isPiexlEqual(241 , 413 , 255 , 255 , 255)
                ){
            if (isPiexlEqual(35 , 343 , 255 , 186 , 0)
                    && isPiexlEqual(151 , 463 , 255 , 186 , 0)
                    && isPiexlEqual(36 , 578 , 255 , 190 , 0)
                    ){
                lv("角色在位置3,并且已选中")
                return 2
            }
            else{
                lv("角色在位置3,但是未选中")
                return 1
            }
        }
        else {
            lv("角色不在不在不在不在位置3")
            return 0
        }
    }
    fun isCharactorAtLocation4_View1() : Boolean{
        if (isPiexlEqual(143 , 786 , 255 , 255 , 255)
                && isPiexlEqual(225, 805, 255 , 255 , 255)
                && isPiexlEqual(269, 811 , 255 , 255 , 255)
                ){
            lv("在View1的视角下角色在位置4")
            return true
        }
        else {
            lv("在View1的视角下角色不在不在不在不在位置4")
            return false
        }
    }
    fun isCharactorAtLocation4_View2(correction : Int) : Int{
        if (isPiexlEqual(152 , 270+correction , 255 , 255 , 255)
                    && isPiexlEqual(235 , 272+correction , 255 , 255 , 255)
                    && isPiexlEqual(261 , 259+correction , 255 , 255 , 255)
                ){
            lv("角色在视角2下的位置4,需要竖直修正量$correction")
            return correction
        }
        else {
            for (i : Int in -30..30){
                if (isPiexlEqual(152 , 270+i , 255 , 255 , 255)
                        && isPiexlEqual(235 , 272+i, 255 , 255 , 255)
                        && isPiexlEqual(261 , 259+i, 255 , 255 , 255)
                        ){
                    lv("角色在视角2下的位置4,需要竖直修正量$i")
                    return i
                }
            }
            lv("角色不在不在不在不在视角2下的位置4")
            return -999
        }
    }

    fun isCharactorAtLocation4_View2_selected(correction : Int) : Int{
        if (isPiexlEqual(63 , 200+correction , 255 , 186 , 0)
                && isPiexlEqual(176 , 323+correction , 255 , 186, 0)
                && isPiexlEqual(63 , 431+correction , 255 , 186 , 0)
                ){
            lv("角色在视角2下的位置4并且被选中,需要竖直修正量$correction")
            return correction
        }
        else {
            for (i : Int in -30..30){
                if (isPiexlEqual(63 , 200+i , 255 , 186 , 0)
                        && isPiexlEqual(176 , 323+i, 255 , 186, 0)
                        && isPiexlEqual(63 , 431+i, 255 , 186 , 0)
                        ){
                    lv("角色在视角2下的位置4并且被选中,需要竖直修正量$i")
                    return i
                }
            }
            lv("角色在视角2下的位置4,并没有被选中")
            return -999
        }
    }

    fun isCharactorAtLocation5(correction: Int) : Int{
        if (isPiexlEqual(128 , 594+correction , 255 , 255 , 255)
            && isPiexlEqual(186 , 592+correction , 255 , 255 , 255)
            && isPiexlEqual(328 , 604+correction , 255 , 255 , 255)
                ){
            lv("角色在位置5,需要竖直修正量$correction")
            return correction
        }
        else {
            for (i : Int in -30..30){
                if (isPiexlEqual(128 , 594+i , 255 , 255 , 255)
                        && isPiexlEqual(186 , 592+i, 255 , 255 , 255)
                        && isPiexlEqual(328 , 604+i, 255 , 255 , 255)
                        ){
                    lv("角色在位置5,需要竖直修正量$i")
                    return i
                }
            }
            lv("角色不在不在不在不在位置5")
            return -999
        }
    }

}
