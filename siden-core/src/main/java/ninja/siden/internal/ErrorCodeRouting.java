/*
 * Copyright 2014 SATO taichi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package ninja.siden.internal;

import ninja.siden.Renderer;
import ninja.siden.RendererCustomizer;
import ninja.siden.Route;

/**
 * @author taichi
 */
class ErrorCodeRouting implements RendererCustomizer<ErrorCodeRouting> {
	Route route;
	Renderer<?> renderer;

	public ErrorCodeRouting(Route route) {
		super();
		this.route = route;
	}

	@Override
	public <MODEL> ErrorCodeRouting render(Renderer<MODEL> renderer) {
		this.renderer = renderer;
		return this;
	}
}
