import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})
export class ShoppingListComponent implements OnInit {
  groceries: any[];

  constructor(private http: HttpClient) { }

  ngOnInit() {
  this.listMyPosts();
  }
  listMyPosts(){
    this.http.get("http://localhost:8080/GroceriesList/shopping-list/getAllItems.app")
    .toPromise()
    .then((r:any[]) => {
      this.groceries = r;
    })
    .catch(e => console.log(e));
  
  
}
}
