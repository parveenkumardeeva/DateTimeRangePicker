package skedgo.datetimerangepicker

import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.databinding.BindingAdapter

object Bindings {
  @BindingAdapter("isDone") @JvmStatic
  fun setIsDone(v: Toolbar, isDone: Boolean) {
    val item = v.menu.findItem(R.id.dateTimeRangePickerDoneItem)
    item!!.isEnabled = isDone
  }

  @BindingAdapter("isVisible") @JvmStatic
  fun setIsVisible(v: View, isVisible: Boolean) {
    v.visibility = if (isVisible) View.VISIBLE else View.GONE
  }
}
