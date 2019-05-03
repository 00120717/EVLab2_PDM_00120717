package tech.visuallatam.pdm_evaluacion2_00120717.Fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import tech.visuallatam.pdm_evaluacion2_00120717.R

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class PanelFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var color: Int = R.id.color_panel
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null
    var newFragment = PanelFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.panel_fragment,container,false).apply { /*aplicar colores al liner*/ }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()

    }

    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {

        fun newInstance(color:Int):PanelFragment{
            val newFragment = PanelFragment()
            newFragment.color = when(color){
                0->R.color.green
                1->R.color.blue
                2->R.color.red
                else->R.color.colorPrimary
            }
            return newFragment
        }
    }
}
