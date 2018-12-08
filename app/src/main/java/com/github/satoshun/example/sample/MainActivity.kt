package com.github.satoshun.example.sample

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.github.satoshun.example.sample.databinding.MainActBinding
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : BaseActivity() {
  @Inject lateinit var resource: UserResource

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    val binding = DataBindingUtil.setContentView<MainActBinding>(this, R.layout.main_act)
    binding.model = Model("TEST")
  }
}

data class Model(val userName: String)
