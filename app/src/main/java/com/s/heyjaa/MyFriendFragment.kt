package com.s.heyjaa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendFragment : Fragment() {

    lateinit var listTeman : ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Eja","Laki-Laki","yeza591@gmail.com","088805533101",
        "Malang")
        )
        listTeman.add(
            MyFriend("Ica","Perempuan","salsabillaalrizqi@gmail.com","088272862697",
        "Plaosan")
        )
    }

    private fun Tampilteman(){
        rv_listMyFriend.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriend.adapter=MyFriendAdapter(activity!!,listTeman)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend,container,false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView(){
        simulasiDataTeman()
        Tampilteman()
    }
    override fun onDestroy(){
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}
