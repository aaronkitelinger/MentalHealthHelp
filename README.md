# Mental Health Focused Group Project
---

### Used with microservices and Spring boot
---

# Introduction

This application is meant to help those with new or occurring mental health conditions and what they can do to help

They will be able to create, store, and document their own stories and struggles with certain illnesses.

The user will be able to search for specific mental illness and find resources and personal stories from other users, You will be also be taken to an info pages about the 
mental health condition where there are resources and basic definitions of each disorder to help users understand more and more about each one.

## Storyboard
[Storyboard in Invision] (https://projects.invisionapp.com/freehand/document/5Gmxa2oT4)
## Endpoint Requirements 
/disorder/…
/myexperiences

## (Given: When: Then: Statements)


### Example
**Given**: A user puts in an endpoint that dooesn't exist
**When**: The webpages loads...
**Then**: The error 404 page is displayed

### Example
**Given**: The user is on the home page
**When**: They click the my experiences button
**Then**: It takes them to the /myexperiences endpoint

### Example
**Given**: The user is on the home page
**When**: They type in the disorder search 
**Then**: The search bar will autocomplete what they are typing

### Example
**Given**: They have entered something in the text box in the /myexperiences endpoint
**When**: The press the submit button
**Then**: That experience will be posted to the the /myexperiences endpoint

### Example
**Given**: The person logs in 
**When**: Submits an experience
**Then**: It appears on their page

### Example
**Given**: Someone has posted about an experience with a specfic disorder 
**When**: Someone is on the disorder info page
**Then**: Their experience will be linked to that page

## CLASS DIAGRAM
![Class Diagram](https://github.com/aaronkitelinger/MentalHealthHelp/blob/a1b037f59eeb2d040030d74a30ffe07e20aa4460/disorder-help-class-diagram.drawio.png?raw=true)

## DTO JSON

This is what we plan to bring to the app.

> {
>   "type" : object",
>   "properties" : {
>     "disorderID" : {
>      "type" : "int"
>     },
>     "disorderName" : {
>       "type" : "String"
>     }, 
>     "dsm5Page" : {
>       "type" : "int"
>     }
>     "percentOfPeople" : {
>       "type" : "float"
>     }
>    }
>  }
   : {"type" : "String"} "dsm5Page" : {"type" : "int"} "percentOfPeople" : {"type" : "float"} } }

## Team Members and Scrum Roles

Aaron Kitelinger – Project Owner/Scrum/DevOps/GitHub Administrator

Benjamin Seamon – Business Logic

Alexander Spurlock – Persistence Specialist

Couri Wilson – UI Specialist

## Git Hub Repository Link

https://github.com/aaronkitelinger/MentalHealthHelp/

## Teams Link
https://teams.microsoft.com/l/meetup-join/19%3ameeting_YzFmODhhYTMtNzdlNS00ZTg5LWJhYmYtY2E5Y2Y1YTY4Mzk0%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%22c4ff1175-0114-4e45-b269-7ef6cf5f23b2%22%7d
