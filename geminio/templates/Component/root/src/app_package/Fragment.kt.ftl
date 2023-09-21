package ${packageName}

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
<#if applicationPackage??>import ${applicationPackage}.R</#if>
import toothpick.ktp.KTP
import toothpick.ktp.delegate.inject

class ${fragmentName} : Fragment(R.layout.${fragmentLayoutResName}) {
    private val adapter = TODO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView? = view.findViewById(R.id.${fragmentLayoutResName}_recycler_view)
        recyclerView?.adapter = adapter
    }

    private fun renderState(data: Any) {
        adapter.submitData(lifecycle, data)
    }
}
