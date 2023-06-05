import { Component } from '@angular/core';
import { Post } from '../post';
import { ActivatedRoute, Router } from '@angular/router';
import { PostService } from '../post.service';


@Component({
  selector: 'app-post-form',
  templateUrl: './post-form.component.html',
  styleUrls: ['./post-form.component.css']
})
export class PostFormComponent {
  post:Post;

  constructor(
    private route:ActivatedRoute,
    private router:Router,
    private postService: PostService
  )
  {
    this.post = new Post();
  }
  onSubmit(){
      this.postService.save(this.post).subscribe(
      
      );
    window.location.reload();
    console.log("DID IT");
    
  }
}
