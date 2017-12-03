<nav class="blue darken-2">
    <div class="nav-wrapper">
        
        <a href="../ticket/listar" class="brand-logo">Helpdesk</a>
        
        <ul class="right">
            <li class="hide-on-med-and-down" ><a><i class="material-icons right">account_circle</i> ${usuario_autenticado.nome} </a></li>
            <li><a href="#" data-activates="slide-out" class="button-collapse"><i class="material-icons">menu</i></a></li>
        </ul>

    </div>
</nav>

<ul id="slide-out" class="side-nav blue darken-2">
    
    <li>
        <div class="user-view">
            <div class="background" style="height: 180px;">
                <img src="../images/sidenav.jpg" style="width: 200%">
            </div>
            <a href="#!user"><img class="circle" src="../images/profile.png"></a>
        </div>
    </li>

    <li style="margin-top: 100px;"><a href="../ticket/listar" class="white-text" style="padding-left: 16px; padding-right: 16px;"><i class="material-icons white-text">book</i>Tickets</a></li>
    
    <li>
        <ul class="collapsible collapsible-accordion">
            <li>
                <a class="collapsible-header white-text"><i class="material-icons white-text left">group</i>Usuários<i class="material-icons white-text right">arrow_drop_down</i></a>
                <div class="collapsible-body blue darken-1">
                    <ul>
                        <li><a href="../usuario_cliente/listar" class="white-text">Clientes</a></li>
                        <li><a href="../usuario_tecnico/listar" class="white-text">Técnicos</a></li>
                        <li><a href="../usuario_adm/listar" class="white-text">Administradores</a></li>
                    </ul>
                </div>
            </li>
        </ul>
    </li>

    <li><a href="../departamento/listar" class="white-text" style="padding-left: 16px; padding-right: 16px;"><i class="material-icons white-text">account_balance_wallet</i>Departamentos</a></li>   
    <li><a href="../logout" class="white-text" style="padding-left: 16px; padding-right: 16px;"><i class="material-icons white-text">exit_to_app</i>Sair</a></li>   

</ul>