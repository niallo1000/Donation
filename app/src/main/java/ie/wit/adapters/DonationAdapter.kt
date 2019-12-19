package ie.wit.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ie.wit.R
import ie.wit.activities.app
import ie.wit.main.DonationApp
import ie.wit.models.DonationModel
import kotlinx.android.synthetic.main.card_donation.view.*

class DonationAdapter constructor(private var donations: List<DonationModel>)
    : RecyclerView.Adapter<DonationAdapter.MainHolder>() {






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(
            LayoutInflater.from(parent?.context).inflate(
                R.layout.card_donation,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {

        val donation = donations[holder.adapterPosition]
        holder.bind(donation)


    }

    override fun getItemCount(): Int = donations.size



    class MainHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(donation: DonationModel) {
            itemView.paymentamount.text = donation.amount.toString()
            itemView.paymentmethod.text = donation.paymentmethod
            itemView.imageIcon.setImageResource(R.mipmap.ic_launcher_round)

        }


    }
}