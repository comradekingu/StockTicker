package com.github.premnirmal.ticker.components

import com.github.premnirmal.ticker.UpdateReceiver
import com.github.premnirmal.ticker.notifications.DailySummaryNotificationReceiver
import com.github.premnirmal.ticker.widget.RefreshReceiver
import com.github.premnirmal.ticker.widget.RemoteStockViewAdapter
import com.github.premnirmal.ticker.widget.StockWidget
import com.github.premnirmal.ticker.widget.WidgetClickReceiver
import com.github.premnirmal.ticker.widget.WidgetData
import com.google.gson.Gson
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by premnirmal on 3/3/16.
 */

interface LegacyComponent {
  fun gson(): Gson

  fun inject(widget: StockWidget)

  fun inject(data: WidgetData)

  fun inject(adapter: RemoteStockViewAdapter)

  fun inject(receiver: WidgetClickReceiver)
  fun inject(receiver: RefreshReceiver)
  fun inject(receiver: UpdateReceiver)
  fun inject(receiver: DailySummaryNotificationReceiver)
}

@InstallIn(SingletonComponent::class)
@EntryPoint
interface AppEntryPoint : LegacyComponent
