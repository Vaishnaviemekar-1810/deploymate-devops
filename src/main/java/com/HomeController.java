package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>DeployMate</title>

                    <style>
                        * {
                            margin: 0;
                            padding: 0;
                            box-sizing: border-box;
                            font-family: Arial, sans-serif;
                        }

                        body {
                            background: #f4f7fb;
                            color: #1f2937;
                        }

                        .navbar {
                            background: #111827;
                            color: white;
                            padding: 20px 60px;
                            display: flex;
                            justify-content: space-between;
                            align-items: center;
                        }

                        .logo {
                            font-size: 25px;
                            font-weight: bold;
                        }

                        .logo span {
                            color: #38bdf8;
                        }

                        .nav-status {
                            background: #14532d;
                            color: #bbf7d0;
                            padding: 8px 16px;
                            border-radius: 20px;
                            font-size: 14px;
                        }

                        .hero {
                            text-align: center;
                            padding: 60px 20px 40px;
                        }

                        .hero h1 {
                            font-size: 48px;
                            margin-bottom: 15px;
                            color: #111827;
                        }

                        .hero h1 span {
                            color: #2563eb;
                        }

                        .hero p {
                            font-size: 18px;
                            color: #6b7280;
                        }

                        .container {
                            max-width: 1100px;
                            margin: auto;
                            padding: 20px;
                        }

                        .cards {
                            display: grid;
                            grid-template-columns: repeat(4, 1fr);
                            gap: 20px;
                        }

                        .card {
                            background: white;
                            padding: 25px;
                            border-radius: 15px;
                            box-shadow: 0 8px 25px rgba(0,0,0,0.08);
                            text-align: center;
                            transition: 0.3s;
                        }

                        .card:hover {
                            transform: translateY(-5px);
                        }

                        .icon {
                            font-size: 35px;
                            margin-bottom: 12px;
                        }

                        .card h3 {
                            color: #6b7280;
                            font-size: 14px;
                            margin-bottom: 8px;
                        }

                        .card p {
                            font-size: 20px;
                            font-weight: bold;
                            color: #111827;
                        }

                        .running {
                            color: #16a34a !important;
                        }

                        .pipeline {
                            background: white;
                            margin-top: 30px;
                            padding: 30px;
                            border-radius: 15px;
                            box-shadow: 0 8px 25px rgba(0,0,0,0.08);
                        }

                        .pipeline h2 {
                            margin-bottom: 25px;
                        }

                        .steps {
                            display: flex;
                            justify-content: space-between;
                            align-items: center;
                            flex-wrap: wrap;
                            gap: 15px;
                        }

                        .step {
                            background: #eff6ff;
                            border: 1px solid #bfdbfe;
                            padding: 15px 20px;
                            border-radius: 10px;
                            text-align: center;
                            min-width: 110px;
                        }

                        .step strong {
                            display: block;
                            margin-top: 5px;
                            color: #1d4ed8;
                        }

                        .arrow {
                            font-size: 25px;
                            color: #2563eb;
                        }

                        footer {
                            text-align: center;
                            padding: 35px;
                            margin-top: 30px;
                            color: #6b7280;
                        }

                        @media (max-width: 800px) {
                            .cards {
                                grid-template-columns: repeat(2, 1fr);
                            }

                            .hero h1 {
                                font-size: 35px;
                            }
                        }
                    </style>
                </head>

                <body>

                    <div class="navbar">
                        <div class="logo">🚀 Deploy<span>Mate</span></div>
                        <div class="nav-status">● System Online</div>
                    </div>

                    <section class="hero">
                        <h1>Welcome to <span>DeployMate</span></h1>
                        <p>Automated CI/CD & Self-Healing Application Platform</p>
                    </section>

                    <div class="container">

                        <div class="cards">

                            <div class="card">
                                <div class="icon">📦</div>
                                <h3>APPLICATION</h3>
                                <p>DeployMate</p>
                            </div>

                            <div class="card">
                                <div class="icon">🏷️</div>
                                <h3>VERSION</h3>
                                <p>1.0</p>
                            </div>

                            <div class="card">
                                <div class="icon">🌐</div>
                                <h3>ENVIRONMENT</h3>
                                <p>Development</p>
                            </div>

                            <div class="card">
                                <div class="icon">✅</div>
                                <h3>STATUS</h3>
                                <p class="running">Running</p>
                            </div>

                        </div>

                        <div class="pipeline">

                            <h2>⚙️ DevOps Pipeline</h2>

                            <div class="steps">

                                <div class="step">
                                    📁
                                    <strong>GitHub</strong>
                                </div>

                                <div class="arrow">→</div>

                                <div class="step">
                                    🔨
                                    <strong>Maven</strong>
                                </div>

                                <div class="arrow">→</div>

                                <div class="step">
                                    🤖
                                    <strong>Jenkins</strong>
                                </div>

                                <div class="arrow">→</div>

                                <div class="step">
                                    🐳
                                    <strong>Docker</strong>
                                </div>

                                <div class="arrow">→</div>

                                <div class="step">
                                    ☸️
                                    <strong>Kubernetes</strong>
                                </div>

                            </div>

                        </div>

                    </div>

                    <footer>
                        DeployMate © 2026 | Automated DevOps Platform
                    </footer>

                </body>
                </html>
                """;
    }
}