import { Component, OnInit } from '@angular/core';
import { CartService } from 'src/app/services/cart.service';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-userhome',
  templateUrl: './userhome.component.html',
  styleUrls: ['./userhome.component.css']
})
export class UserhomeComponent implements OnInit {
  Products:any;
  searchproduct:any;//this for the searching purpossed
  constructor(private service:ProductService,private cartservice:CartService) { }

  ngOnInit(): void {
    this.service.getactiveproduct().subscribe(
      (data:any)=>{
        this.Products=data;
         
        console.log(this.Products);
        //added now for the new column
         this.Products.array.forEach((a:any) => {
          Object.assign(a,{quantity:1});
         });
        //added ended

      },
      (error)=>{
        console.log(error);
      }
    )
  }

  addtocart(p:any){
     this.cartservice.addtoCart(p);
  }

}