package ru.kvf.geminiotest.login

import com.arkivanov.decompose.ComponentContext

class RealLoginComponent(
    componentContext: ComponentContext
) : ComponentContext by componentContext, LoginComponent {

}
