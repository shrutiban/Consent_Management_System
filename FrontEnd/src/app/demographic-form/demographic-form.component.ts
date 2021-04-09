import { Component, OnInit } from '@angular/core';
import {CdkTextareaAutosize} from '@angular/cdk/text-field';
import { NgZone, ViewChild} from '@angular/core';
import {take} from 'rxjs/operators';
import { FormGroup } from '@angular/forms';
import { Validators } from '@angular/forms';
import { FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { RegisterService } from '../services/register.service';
@Component({
  selector: 'app-demographic-form',
  templateUrl: './demographic-form.component.html',
  styleUrls: ['./demographic-form.component.css']
})
export class DemographicFormComponent implements OnInit {

  registrationForm! : FormGroup ;
  firstname! : string;
  lastname! : string; 

  constructor(private _ngZone: NgZone, private router:Router, private regService: RegisterService) {}
  
  ngOnInit(): void {

    console.log("inside nginit of demographic form");
    this.registerForm();


  }
  @ViewChild('autosize') autosize!: CdkTextareaAutosize;


registerForm()
{
    console.log("inside registrationform");
    this.registrationForm = new FormGroup({
    firstName: new FormControl('',[Validators.required]),
    lastName: new FormControl('',[Validators.required]),
    email: new FormControl('',[Validators.required]),
    phoneNumber: new FormControl('',[Validators.required]),
    address: new FormControl('',[Validators.required]),
    age: new FormControl('',[Validators.required]),
    bloodGroup: new FormControl('',[Validators.required]),
    gender: new FormControl('',[Validators.required]),

    })
    console.log("Endo of registrationform method");
}

addUser()
{
  console.log("inside adduser()");
 console.log("registration form values: ",this.registrationForm.value);
  if(this.registrationForm.valid)
  {
      

      this.regService.register(this.registrationForm.value).subscribe(result=>{

        if(result.success){
          console.log("came into addUser()",result);
          alert(result.message);
          
        }
        else{
          console.log("inside else of addUser")
          alert(result.message);
        }

      })

  }
}

  
}
