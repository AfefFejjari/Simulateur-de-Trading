import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { StockComponent } from './order/stock/stock.component';


const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path:'',redirectTo:'login',pathMatch:'full'},
  {path:'Register',component: RegisterComponent},
  {path:'Dashboard',component: DashboardComponent},
  {path:'Dashboard/tradestock',component: StockComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
