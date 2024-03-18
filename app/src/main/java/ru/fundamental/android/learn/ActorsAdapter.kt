package ru.fundamental.android.learn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.fundamental.android.learn.data.models.Actor
import java.util.LinkedList

class ActorsAdapter: RecyclerView.Adapter<ActorHolder>() {

    private var actorList: List<Actor> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_actor, parent, false)
        return ActorHolder(view)
    }

    override fun getItemCount(): Int = actorList.size

    override fun onBindViewHolder(holder: ActorHolder, position: Int) {
        holder.onBind(actorList[position])
    }

    fun bindActors(newActor: LinkedList<Actor>) {
        actorList = newActor
        notifyDataSetChanged()
    }

}

class ActorHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val avatar: ImageView = itemView.findViewById(R.id.iv_actor_avatar)
    private val name: TextView = itemView.findViewById(R.id.tv_name_actor)


    fun onBind(actor: Actor) {
        itemView.apply {
            name.text = actor.name
            avatar.setImageResource(actor.avatar)
        }
    }
}


private val RecyclerView.ViewHolder.context
    get() = this.itemView.context