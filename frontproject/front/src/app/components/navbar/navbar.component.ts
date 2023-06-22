import { Component, OnInit } from '@angular/core';
import { CartService } from 'src/app/services/cart.service';
import { LoginService } from 'src/app/services/login.service';


@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
 public totalitem:number=0;
  isLoggedIn=false;
      user= null;
  



  constructor(public login: LoginService,private cartservice:CartService) { }

  ngOnInit(): void {
    this.isLoggedIn=this.login.isLoggedIn();
    this.user = this.login.getUser();
    this.login.loginStatusSubject.asObservable().subscribe(data=>
      {
        this.isLoggedIn=this.login.isLoggedIn();
    this.user = this.login.getUser();
      });

      //code for the cart started
      this.cartservice.getProducts().subscribe(
        res=>{
          this.totalitem=res.length;
        }
      )
  }

  public logout(){
    this.login.logout();
    
    window.location.reload();
   this.login.loginStatusSubject.next(false)
  }

}
