package com.mifos.objects.accounts.loan

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/*
 * This project is licensed under the open source MPL V2.
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */ /**
 * Created by nellyk on 2/21/2016.
 */
@Parcelize
data class DaysInYearType(
    var id : Int? = null,

    var code : Int? = null,
    
    var value : Int? = null
) : Parcelable