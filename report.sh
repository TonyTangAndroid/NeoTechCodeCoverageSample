#!/usr/bin/env bash
./gradlew clean rootCodeCoverageReport
open ./build/reports/jacoco/index.html
