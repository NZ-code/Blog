import { Component } from '@angular/core';
import { PostService } from '../post.service';

import { Post } from '../post';
@Component({
  selector: 'app-post-list',
  templateUrl: './post-list.component.html',
  styleUrls: ['./post-list.component.css']
})
export class PostListComponent {
  posts: Post[];
  constructor(private postService:PostService){

  }  
  ngOnInit(){
      this.postService.findAll().subscribe(
        data =>{
          this.posts = data;
        }
      )
  }
}
