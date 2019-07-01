import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html'
})
export class SideNavComponent implements OnInit {

  items = [    
    {
      label: 'Aluno',
      routerLink: '/aluno'
    },
    {
      label: 'Professor',
      routerLink: '/professor'
    },
    {
      label: 'Matéria',
      routerLink: '/materia'
    },
    {
      label: 'Turma',
      routerLink: '/turma'
    }
  ];

  constructor() { }

  ngOnInit() {
  }

}
