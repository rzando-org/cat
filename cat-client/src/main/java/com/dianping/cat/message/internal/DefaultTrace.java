/*
 * Copyright (c) 2011-2018, Meituan Dianping. All Rights Reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dianping.cat.message.internal;

import com.dianping.cat.message.Trace;
import com.dianping.cat.message.context.TraceContext;

public class DefaultTrace extends AbstractMessage implements Trace {
	public DefaultTrace(TraceContext ctx, String type, String name) {
		super(type, name);

		ctx.add(this);
	}

	public DefaultTrace(String type, String name) {
		super(type, name);
	}

	@Override
	public void complete() {
		super.setCompleted();
	}
}
