/*
 * Copyright (C) 2015 Drakeet <drakeet.me@gmail.com>
 *
 * This file is part of Meizhi
 *
 * Meizhi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Meizhi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Meizhi.  If not, see <http://www.gnu.org/licenses/>.
 */

package navyblue.top.colortalk.ui.listeners;

import android.view.View;

import navyblue.top.colortalk.mvp.models.Moment;

/**
 * 邪恶的 class 名。。。。
 * Created by drakeet on 7/1/15.
 */
public interface OnMomentListener {
    void onTouch(View v, View meizhiView, View card, Moment moment);
}