# Eco Farming

![Version](https://img.shields.io/badge/version-1.0.0-blue)
![License](https://img.shields.io/badge/license-MIT-green)

### "챌린지를 통해 환경 보호 습관 형성을 돕는 서비스"

## 🗓️ 프로젝트 개요

**팀명**: 하츄핑  
**기간**: 2024.08.19 - 2024.10.11 (7주)

## 👤 팀 구성

| 팀원 이름 | 역할 및 담당 | 주요 작업 |
|-----------|-------------|-----------|
| **김수빈** | BE, FE | 인증샷 업로드, 관리자 FCM & MM 알림 처리 |
| **김재현** | BE, FE | Spring Batch를 통한 챌린지 정산, 회원 관리, ERD 설계 |
| **김태경** | AI | ResNet-50 AI 모델 학습, Flask 배포 |
| **이찬민** | BE, FE, Infra | CI/CD 파이프라인 구축, 인증목록 조회 |
| **이지은** | Design, FE | 전체 페이지 디자인, 챌린지 상세페이지 구현 |
| **이효림** | BE, FE | 결제 프로세스 연동 및 UCC 제작 |

## 💡 기획 배경

환경 보호 실천을 지속하기 어려운 현실을 개선하기 위해 재미 요소와 보상 시스템, 커뮤니티 기반 챌린지를 도입하여 지속 가능한 환경 보호 문화를 조성하고자 함

### 🔎 문제 인식
- 지구 온도는 역사적 최고치를 연이어 경신하며 기후 위기가 심화되고 있음
- 많은 사람들이 환경 보호의 중요성을 인식하면서도 장기적인 실천에 어려움을 겪고 있음
- 개인의 의지만으로는 지속적인 환경 보호 활동을 유지하기 어려운 현실적 한계 존재

### 📊 원인 분석
- 환경 보호 활동은 개인 단독으로 실천 시 동기부여와 흥미 요소가 부족함
- 성취감과 보상을 즉각적으로 경험하기 어려워 지속적 참여율 저하
- 함께 참여하고 공유할 수 있는 통합 플랫폼의 부재로 사회적 연대감 형성에 한계

### 🎯 해결 방안
- 사용자 동기부여 메커니즘 구축: 상금, 포인트 제도, 레벨 시스템을 통한 보상 체계 확립
- 소셜 임팩트 강화: 챌린지 참여, 인증샷 공유를 통한 사회적 연대감 조성
- 게이미피케이션 요소 도입: 환경 보호 활동을 게임화된 챌린지 형식으로 재구성하여 재미와 성취감 부여

## 🛠 기술 스택

### 🖥️ Frontend

<div style="background-color: #f8f9fa; padding: 15px; border-radius: 5px;">
<img src="https://img.shields.io/badge/Node.js-18.13.0-339933?logo=node.js&logoColor=white">
<img src="https://img.shields.io/badge/Axios-1.3.6-5A29E4?logo=axios&logoColor=white">
<img src="https://img.shields.io/badge/React-18.2.0-61DAFB?logo=react&logoColor=white">
<img src="https://img.shields.io/badge/Redux-8.0.5-764ABC?logo=redux&logoColor=white">
<img src="https://img.shields.io/badge/Apex_Charts-3.39.0-F9A03C?logo=apexcharts&logoColor=white">
<img src="https://img.shields.io/badge/Echarts-5.4.2-CA4245?logo=apacheecharts&logoColor=white">
<img src="https://img.shields.io/badge/Jwt_Decode-3.1.2-06B6D4?logo=jwtdecode&logoColor=white">
</div>

### 🧠 Backend

<div style="background-color: #f8f9fa; padding: 15px; border-radius: 5px;">
<img src="https://img.shields.io/badge/Java-17.0.2-007396?logo=java&logoColor=white">
<img src="https://img.shields.io/badge/Spring_Boot-3.3.3-6DB33F?logo=spring-boot&logoColor=white">
<img src="https://img.shields.io/badge/Spring_Data_JPA-3.3.3-6DB33F?logo=spring-data-jpa&logoColor=white">
<img src="https://img.shields.io/badge/Python-3.9.18-3776AB?logo=python&logoColor=#3776AB">
<img src="https://img.shields.io/badge/MySQL-9.0.1-4479A1?logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/Spring_Batch-5.1.2-6DB33F?logo=springbatch&logoColor=#6DB33F">
<img src="https://img.shields.io/badge/Spring_Security-6.3.3-6DB33F?logo=springsecurity&logoColor=#6DB33F">
<img src="https://img.shields.io/badge/JWT-0.12.3-000000?logo=json-web-tokens&logoColor=white">
<img src="https://img.shields.io/badge/Redis-7.4.0-FF4438?logo=redis&logoColor=#FF4438">


</div>

### 🤖 AI

<div style="background-color: #f8f9fa; padding: 15px; border-radius: 5px;">
<img src="https://img.shields.io/badge/YOLO-8.1.11-111F68?logo=yolo&logoColor=#111F68">
</div>

### 🌐 Infrastructure

<div style="background-color: #f8f9fa; padding: 15px; border-radius: 5px;">
<img src="https://img.shields.io/badge/AWS_EC2-t2.xlarge-FF9900?logo=amazon-aws&logoColor=white">
<img src="https://img.shields.io/badge/Ubuntu-20.04.6_LTS-E95420?logo=ubuntu&logoColor=white">
<img src="https://img.shields.io/badge/Docker-27.2.1-2496ED?logo=docker&logoColor=white">
<img src="https://img.shields.io/badge/Jenkins-2.462.2-D24939?logo=jenkins&logoColor=white">
<img src="https://img.shields.io/badge/Nginx-1.18.0-009639?logo=nginx&logoColor=white">
</div>

## 🔑 주요 기능
<table>
  <tr>
    <td><img src="./assets/read_challenge.png" width="100%"></td>
    <td><img src="./assets/join_challenge.png" width="100%"></td>
    <td><img src="./assets/proof_check.png" width="100%"></td>
  </tr>
</table>

## 🌟 차별성
<table>
  <tr>
    <td><img src="./assets/various_challenge.png" width="100%"></td>
    <td><img src="./assets/enjoy_payment.png" width="100%"></td>
    <td><img src="./assets/ai_complaint_check.png" width="100%"></td>
  </tr>
</table>


## 🏗️ 시스템 아키텍처

<img src="./assets/architecture.png" width="96%">

## 📑 ERD

<img src="./assets/Eco_Farming_ZZIN.png" width="96%">


## 📂 프로젝트 구조

### 🗂️ 백엔드 프로젝트 구조
```
├── 🗂️ backend
│   ├── 🗂️ gradle
│   └── 🗂️ src
│       ├── 🗂️ main
│       │   ├── 🗂️ java
│       │   │   └── 🗂️ com.a101.ecofarming
│       │   │               ├── 🗂️ balanceGame
│       │   │               │   ├── 🗂️ entity
│       │   │               │   └── 🗂️ repository
│       │   │               ├── 🗂️ challenge
│       │   │               │   ├── 🗂️ batch
│       │   │               │   │   ├── 🗂️ config
│       │   │               │   │   ├── 🗂️ scheduler
│       │   │               │   │   └── 🗂️ tasklet
│       │   │               │   ├── 🗂️ controller
│       │   │               │   ├── 🗂️ dto
│       │   │               │   │   └── 🗂️ response
│       │   │               │   ├── 🗂️ entity
│       │   │               │   ├── 🗂️ repository
│       │   │               │   └── 🗂️ service
│       │   │               ├── 🗂️ challengeCategory
│       │   │               │   ├── 🗂️ entity
│       │   │               │   ├── 🗂️ repository
│       │   │               │   └── 🗂️ service
│       │   │               ├── 🗂️ challengeUser
│       │   │               │   ├── 🗂️ batch
│       │   │               │   │   ├── 🗂️ config
│       │   │               │   │   ├── 🗂️ processor
│       │   │               │   │   ├── 🗂️ reader
│       │   │               │   │   ├── 🗂️ scheduler
│       │   │               │   │   └── 🗂️ writer
│       │   │               │   ├── 🗂️ controller
│       │   │               │   ├── 🗂️ dao
│       │   │               │   ├── 🗂️ dto
│       │   │               │   │   └── 🗂️ response
│       │   │               │   ├── 🗂️ entity
│       │   │               │   ├── 🗂️ repository
│       │   │               │   └── 🗂️ service
│       │   │               ├── 🗂️ complaint
│       │   │               │   ├── 🗂️ controller
│       │   │               │   ├── 🗂️ dto
│       │   │               │   ├── 🗂️ entity
│       │   │               │   ├── 🗂️ repository
│       │   │               │   └── 🗂️ service
│       │   │               ├── 🗂️ global
│       │   │               │   ├── 🗂️ config
│       │   │               │   ├── 🗂️ entity
│       │   │               │   ├── 🗂️ exception
│       │   │               │   ├── 🗂️ notification
│       │   │               │   │   └── 🗂️ mattermost
│       │   │               │   │   └── 🗂️ fcm
│       │   │               │   └── 🗂️ security
│       │   │               │       ├── 🗂️ Controller
│       │   │               │       ├── 🗂️ config
│       │   │               │       ├── 🗂️ dto
│       │   │               │       ├── 🗂️ filter
│       │   │               │       ├── 🗂️ repository
│       │   │               │       ├── 🗂️ service
│       │   │               │       └── 🗂️ util
│       │   │               ├── 🗂️ proof
│       │   │               │   ├── 🗂️ controller
│       │   │               │   ├── 🗂️ dto
│       │   │               │   │   ├── 🗂️ request
│       │   │               │   │   └── 🗂️ response
│       │   │               │   ├── 🗂️ entity
│       │   │               │   ├── 🗂️ repository
│       │   │               │   └── 🗂️ service
│       │   │               └── 🗂️ user
│       │   │                   ├── 🗂️ controller
│       │   │                   ├── 🗂️ dto
│       │   │                   │   ├── 🗂️ request
│       │   │                   │   └── 🗂️ response
│       │   │                   ├── 🗂️ entity
│       │   │                   ├── 🗂️ repository
│       │   │                   └── 🗂️ service
│       │   └── 🗂️ resources
```

### 🗂️ 프론트엔드 프로젝트 구조 
```
├── 🗂️ frontend
│   ├── 🗂️ public
│   │   └── 🗂️ icons
│   └── 🗂️ src
│       ├── 🗂️ assets
│       │   └── 🗂️ images
│       ├── 🗂️ components
│       └── 🗂️ services
```

---
## 📹 시연 영상 및 자료

- **발표 자료:** [MiriCanvas](https://www.miricanvas.com/v/13qpik5)
- **시연 영상:** [YouTube](https://www.youtube.com/watch?v=ngiXBbhoRrc)
- **영상 포트폴리오** [YouTube](https://www.youtube.com/watch?v=_zmqM5AO4hQ)   
- **배포 링크:** https://ecofarming.lol (현재 서비스 종료)
