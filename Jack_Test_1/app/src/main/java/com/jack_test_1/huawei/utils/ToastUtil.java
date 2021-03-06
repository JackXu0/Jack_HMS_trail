/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.jack_test_1.huawei.utils;

import android.view.Gravity;
import android.widget.Toast;

import com.jack_test_1.huawei.MyApplication;

/**
 * Display util.
 *
 * @since 2020-01-13
 */
public class ToastUtil {
    private static Toast toast;

    /**
     * short time display, at the top of the page.
     *
     * @param msg message to display.
     */
    public static void showShortToastTop(String msg) {
        if (MyApplication.getInstance() != null) {
            if (toast == null) {
                toast = Toast.makeText(MyApplication.getInstance(), msg, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0, 0);
            } else {
                toast.setText(msg);
            }
            toast.show();
        }
    }
}
