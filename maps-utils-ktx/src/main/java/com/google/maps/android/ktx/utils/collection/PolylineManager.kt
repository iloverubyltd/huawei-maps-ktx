/*
 * Copyright 2020 Google Inc.
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
 *
 */

package com.google.maps.android.ktx.utils.collection

import com.google.android.gms.maps.model.Polyline
import com.google.android.gms.maps.model.PolylineOptions
import com.google.maps.android.collections.PolylineManager

/**
 * Adds a new [Polyline] to the underlying map and to this [PolylineManager.Collection] with the
 * provided [optionsActions].
 */
public inline fun PolylineManager.Collection.addPolyline(
    optionsActions: PolylineOptions.() -> Unit
): Polyline =
    this.addPolyline(
        PolylineOptions().apply(optionsActions)
    )
