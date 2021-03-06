/*
 * Copyright (c) 2019 Hocuri
 *
 * This file is part of SuperFreezZ.
 *
 * SuperFreezZ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SuperFreezZ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SuperFreezZ.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package superfreeze.tool.android.userInterface.settingsActivity

import android.content.res.Configuration
import android.os.Bundle
import android.preference.PreferenceActivity
import androidx.annotation.LayoutRes
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup

/**
 * A [android.preference.PreferenceActivity] which implements and proxies the necessary calls
 * to be used with AppCompat.
 * Note that this class was completely generated by Android Studio, the only thing I changed was add this line.
 */
abstract class AppCompatPreferenceActivity : PreferenceActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		delegate.installViewFactory()
		delegate.onCreate(savedInstanceState)
		super.onCreate(savedInstanceState)
	}

	override fun onPostCreate(savedInstanceState: Bundle?) {
		super.onPostCreate(savedInstanceState)
		delegate.onPostCreate(savedInstanceState)
	}

	val supportActionBar: ActionBar?
		get() = delegate.supportActionBar

	fun setSupportActionBar(toolbar: Toolbar?) {
		delegate.setSupportActionBar(toolbar)
	}

	override fun getMenuInflater(): MenuInflater {
		return delegate.menuInflater
	}

	override fun setContentView(@LayoutRes layoutResID: Int) {
		delegate.setContentView(layoutResID)
	}

	override fun setContentView(view: View) {
		delegate.setContentView(view)
	}

	override fun setContentView(view: View, params: ViewGroup.LayoutParams) {
		delegate.setContentView(view, params)
	}

	override fun addContentView(view: View, params: ViewGroup.LayoutParams) {
		delegate.addContentView(view, params)
	}

	override fun onPostResume() {
		super.onPostResume()
		delegate.onPostResume()
	}

	override fun onTitleChanged(title: CharSequence, color: Int) {
		super.onTitleChanged(title, color)
		delegate.setTitle(title)
	}

	override fun onConfigurationChanged(newConfig: Configuration) {
		super.onConfigurationChanged(newConfig)
		delegate.onConfigurationChanged(newConfig)
	}

	override fun onStop() {
		super.onStop()
		delegate.onStop()
	}

	override fun onDestroy() {
		super.onDestroy()
		delegate.onDestroy()
	}

	override fun invalidateOptionsMenu() {
		delegate.invalidateOptionsMenu()
	}

	private val delegate: AppCompatDelegate by lazy {
		AppCompatDelegate.create(this, null)
	}
}
