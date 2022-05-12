package com.liveramp.companyfinder.ui.activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.liveramp.companyfinder.R
import com.liveramp.companyfinder.ui.model.Company

class CompanyListAdapter(private val companyList: List<Company>, private val listener: CompanyListCallback) :
    RecyclerView.Adapter<CompanyListAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        init {
            // Define click listener for the ViewHolder's View.
            textView = view.findViewById(R.id.tv_company)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.company_list_item, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.textView.text = companyList[position].company
        viewHolder.textView.setOnClickListener {
            listener.onItemSelected(companyList[position])
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = companyList.size

}