/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.databinding.testapp.vo;

import com.android.databinding.library.BaseObservable;

import android.binding.Bindable;

public class TableLayoutBindingObject extends BindingAdapterBindingObject {
    @Bindable
    private String mCollapseColumns = "1";
    @Bindable
    private String mShrinkColumns = "1";
    @Bindable
    private String mStretchColumns = "1";
    @Bindable
    private int mDivider = 0xFF112233;

    public String getCollapseColumns() {
        return mCollapseColumns;
    }

    public String getShrinkColumns() {
        return mShrinkColumns;
    }

    public String getStretchColumns() {
        return mStretchColumns;
    }

    public int getDivider() {
        return mDivider;
    }

    public void changeValues() {
        mCollapseColumns = "";
        mShrinkColumns = "1,0";
        mStretchColumns = "*";
        mDivider = 0xFF445566;
        notifyChange();
    }
}
